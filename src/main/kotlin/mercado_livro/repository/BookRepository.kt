package mercado_livro.repository

import mercado_livro.enums.BookStatus
import mercado_livro.model.BookModel
import mercado_livro.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookModel, Int> {
    fun findByStatus(status: BookStatus): List<BookModel>
    fun findByCustomer(customer: CustomerModel): List<BookModel>

}