package mercado_livro.controller.request

import jakarta.validation.constraints.Email

import jakarta.validation.constraints.NotEmpty
import mercado_livro.validation.EmailAvailable

data class PostCustomerRequest (

    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @field:Email(message = "Email deve ser válido")
    @EmailAvailable(message = "Email em uso")
    var email: String,

    @field:NotEmpty(message = "Senha dece ser informada")
    var password: String

)
