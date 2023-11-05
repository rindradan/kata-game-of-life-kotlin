import CellStatus.ALIVE
import CellStatus.DEAD
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class CellNeighborServiceTest {

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 0 alive neighbor WHEN getAliveNeighborsCount THEN should return 0`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 0
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 1 alive neighbor on (0,1) WHEN getAliveNeighborsCount THEN should return 1`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 1
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 2 alive neighbors on (0,0) and (0,1) WHEN getAliveNeighborsCount THEN should return 2`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 2
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 3 alive neighbors on (0,0), (0,1), (0,2) WHEN getAliveNeighborsCount THEN should return 3`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(DEAD), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 3
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 4 alive neighbors on (0,0), (0,1), (0,2), (1,0) WHEN getAliveNeighborsCount THEN should return 4`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 4
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 5 alive neighbors on (0,0), (0,1), (0,2), (1,0), (1,2) WHEN getAliveNeighborsCount THEN should return 5`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 5
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 6 alive neighbors on (0,0), (0,1), (0,2), (1,0), (1,2), (2,0) WHEN getAliveNeighborsCount THEN should return 6`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 6
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 7 alive neighbors on (0,0), (0,1), (0,2), (1,0), (1,2), (2,0), (2,1) WHEN getAliveNeighborsCount THEN should return 7`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 7
    }

    @Test
    fun `GIVEN a grid (3,3), an alive cell on (1,1), 8 alive neighbors on (0,0), (0,1), (0,2), (1,0), (1,2), (2,0), (2,1), (2,2) WHEN getAliveNeighborsCount THEN should return 8`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
            arrayOf(Cell(ALIVE), Cell(ALIVE), Cell(ALIVE)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 8
    }

    @Test
    @Disabled("irrelevant for the moment")
    fun `GIVEN a grid (3,3), an alive cell on (0,0), 0 alive neighbors WHEN getAliveNeighborsCount THEN should return 0`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(ALIVE), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val aliveNeighborsCount = cellNeighborService.getAliveNeighborsCount(grid)
        // THEN
        aliveNeighborsCount shouldBe 0
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (-1,-1) THEN should return 0`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = -1, cellColumnIndex = -1)
        // THEN
        neighborsCount shouldBe 0
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (0,0) THEN should return 3`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 0, cellColumnIndex = 0)
        // THEN
        neighborsCount shouldBe 3
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (0,1) THEN should return 5`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 0, cellColumnIndex = 1)
        // THEN
        neighborsCount shouldBe 5
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (0,2) THEN should return 3`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 0, cellColumnIndex = 2)
        // THEN
        neighborsCount shouldBe 3
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (1,0) THEN should return 5`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 1, cellColumnIndex = 0)
        // THEN
        neighborsCount shouldBe 5
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (1,1) THEN should return 8`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 1, cellColumnIndex = 1)
        // THEN
        neighborsCount shouldBe 8
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (1,2) THEN should return 5`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 1, cellColumnIndex = 2)
        // THEN
        neighborsCount shouldBe 5
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (2,0) THEN should return 3`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 2, cellColumnIndex = 0)
        // THEN
        neighborsCount shouldBe 3
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (2,1) THEN should return 5`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 2, cellColumnIndex = 1)
        // THEN
        neighborsCount shouldBe 5
    }

    @Test
    fun `GIVEN a grid (3,3) WHEN getNeighborsCount from a cell on (2,2) THEN should return 3`() {
        // GIVEN
        val grid: Array<Array<Cell>> = arrayOf(
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
            arrayOf(Cell(DEAD), Cell(DEAD), Cell(DEAD)),
        )
        val cellNeighborService = CellNeighborService()
        // WHEN
        val neighborsCount = cellNeighborService.getNeighborsCount(grid = grid, cellRowIndex = 2, cellColumnIndex = 2)
        // THEN
        neighborsCount shouldBe 3
    }
}
