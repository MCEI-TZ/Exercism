public class GameMaster {
    public String describe(Character character){
        return new StringBuilder()
                .append("You're a level ")
                .append(character.getLevel())
                .append(" ")
                .append(character.getCharacterClass())
                .append(" with ")
                .append(character.getHitPoints())
                .append(" hit points.")
                .toString();
    }

    public String describe(Destination destination){
        return new StringBuilder()
                .append("You've arrived at ")
                .append(destination.getName())
                .append(", which has ")
                .append(destination.getInhabitants())
                .append(" inhabitants.")
                .toString();
    }

    public String describe(TravelMethod travelMethod){
        String travel = switch (travelMethod){
            case WALKING -> "by walking.";
            case HORSEBACK -> "on horseback.";
        };
        return new StringBuilder()
                .append("You're traveling to your destination ")
                .append(travel)
                .toString();
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod){
        return new StringBuilder()
                .append(describe(character))
                .append(" ")
                .append(describe(travelMethod))
                .append(" ")
                .append(describe(destination))
                .toString();
    }

    public String describe(Character character, Destination destination){
        return new StringBuilder()
                .append(describe(character))
                .append(" ")
                .append(describe(TravelMethod.WALKING))
                .append(" ")
                .append(describe(destination))
                .toString();
    }
}
