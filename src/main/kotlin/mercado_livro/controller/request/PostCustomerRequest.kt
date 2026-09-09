package mercado_livro.controller.request

import mercado_livro.model.CustomerModel

data class PostCustomerRequest (
    var name: String,
    var email: String
)
