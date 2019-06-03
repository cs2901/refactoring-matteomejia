package organizing_data;

class Energy {
    const double G = 9.81;
    double potentialEnergy(double mass, double height){
        return mass * height * G;
    }
}