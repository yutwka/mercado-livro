package mercado_livro.controller.response

import mercado_livro.enums.BookStatus
import mercado_livro.model.CustomerModel
import java.math.BigDecimal

data class BookResponse(
    var id: Int? = null,

    var name: String,

    var price: BigDecimal,

    var customer: CustomerModel? = null,

    var status: BookStatus? = null
)
