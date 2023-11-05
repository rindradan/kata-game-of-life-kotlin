import CellStatus.ALIVE
import CellStatus.DEAD
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class GameOfLifeTest {
    @Test
    fun `a cell with no neighbors should be dead by solitude`() {
        // GIVEN
        val cell = Cell(ALIVE)
        val game = GameOfLife(cell = cell, neighborsCount = 0)
        // WHEN
        val nextCell = game.nextGeneration()
        // THEN
        nextCell shouldBe Cell(DEAD)
    }
}
