package practice.app.myapplication.domain.usecases

import practice.app.myapplication.data.db.CheeseDb
import practice.app.myapplication.data.model.Cheese

interface InsertCheeseUseCase {
    suspend fun execute(text: CharSequence)
}

class InsertCheeseUseCaseImpl(private val cheeseDb: CheeseDb) : InsertCheeseUseCase {

    override suspend fun execute(text: CharSequence) {
        val cheese = Cheese(id = 0, name = text.toString())
        cheeseDb.cheeseDao().insert(cheese)
    }

}