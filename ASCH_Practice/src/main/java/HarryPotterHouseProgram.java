class HarryPotterHouseProgram {
    public String defineHouse(String house) {
        switch (house) {
            case "gryffindor":
                return ("bravery");
            case "hufflepuff":
               return ("loyalty");
            case "slytherin":
                return ("cunning");
            case "ravenclaw":
                return "intellect";
            default:
                return "not a valid house";
        }
    }
}
