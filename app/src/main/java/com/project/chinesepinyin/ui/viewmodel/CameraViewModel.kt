package com.project.chinesepinyin.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.project.chinesepinyin.domain.model.RecognizedTextBlock
import com.project.chinesepinyin.domain.usecase.ConvertToPinyinUseCase
import com.google.mlkit.vision.text.Text
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

data class CameraUiState(
    val textBlocks: List<RecognizedTextBlock> = emptyList(),
    val imageWidth: Int = 0,
    val imageHeight: Int = 0,
    val isProcessing: Boolean = false
)

@HiltViewModel
class CameraViewModel @Inject constructor(
    private val convertToPinyinUseCase: ConvertToPinyinUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(CameraUiState())
    val uiState: StateFlow<CameraUiState> = _uiState.asStateFlow()

    fun onTextRecognized(visionText: Text, imageWidth: Int, imageHeight: Int) {
        val blocks = convertToPinyinUseCase.execute(visionText, imageWidth, imageHeight)
        _uiState.value = CameraUiState(
            textBlocks = blocks,
            imageWidth = imageWidth,
            imageHeight = imageHeight,
            isProcessing = false
        )
    }

    fun onProcessingStarted() {
        _uiState.value = _uiState.value.copy(isProcessing = true)
    }
}
