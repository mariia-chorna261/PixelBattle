package pixelbattle.ultimates;

import pixelbattle.core.Fighter;
import pixelbattle.core.Ultimate;

public class Meteor implements Ultimate {

    @Override
    public String getName() {
        return "Метеорит";
    }

    @Override
    public String getDescription() {
        return "20-30 шкоди кожному живому ворогу";
    }

    @Override
    public String activate(Fighter user, Fighter[] allies, Fighter[] enemies) {
        int total = 0;
        for (Fighter e : enemies) {
            if (e.isAlive()) {
                total += e.takeDamage(Fighter.random(20, 30));
            }
        }
        return user.getName() + " викликає Метеорит! Загальна шкода: " + total;
    }
}