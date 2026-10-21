import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        // 1. Siapkan DATA terlebih dahulu (layer Model)
        CharacterManager manager = new CharacterManager();
        manager.addCharacter(new Character("Ferdi", CharacterType.WARRIOR, 5));
        manager.addCharacter(new Character("Charlie xcx", CharacterType.MAGE, 3));
        manager.addCharacter(new Character("Lalisa la Diva", CharacterType.ARCHER, 4));
        
        // Karakter Tambahan (Minimal 5 karakter)
        manager.addCharacter(new Character("Buna tedy", CharacterType.WARRIOR, 8));
        manager.addCharacter(new Character("Wati", CharacterType.HEALER, 6));

        // 2. Jalankan GUI dengan AMAN di Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow(
                manager.getAllCharacters(), 
                manager.getAverageLevel()
            );
            window.setVisible(true); // Tampilkan jendela GUI
        });
    }
}