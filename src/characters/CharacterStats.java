package characters;

import attributes.Attributes;

public interface CharacterStats {
    Attributes calculateTotalStats();
    double calculateCharacterDps();
}
