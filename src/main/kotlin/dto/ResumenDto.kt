package dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import serializers.LocalDateTimeSerializer
import serializers.UUIDSerializer
import java.time.LocalDateTime
import java.util.*

@Serializable
@SerialName("resumen")
data class ResumenDto(
    @Serializable(with = UUIDSerializer::class)
    val id: UUID = UUID.randomUUID(),
    val tipo: String = "",
    val maxValue: Double = 0.0,
    @Serializable(with = LocalDateTimeSerializer::class)
    val fecha: LocalDateTime = LocalDateTime.now(),
)
