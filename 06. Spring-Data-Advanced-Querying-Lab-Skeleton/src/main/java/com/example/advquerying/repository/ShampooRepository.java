import com.example.advquerying.entities.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShampooRepository extends JpaRepository<Shampoo, Long> {

    List<Shampoo> findShampooByBrand(String brand);
    List<Shampoo> getAllBySizeOrderById(Size size);

    @Query("select s from Shampoo as s where s.brand = :brand")
    List<Shampoo> getshampoos1(String brand);

}