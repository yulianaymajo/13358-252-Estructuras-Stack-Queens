class area {
	public static void main(String[] args) {
        
        double lado = 5;        
        double radio = 3;       
        double baseT = 6;       
        double alturaT = 4;     
        double baseR = 8;       
        double alturaR = 3;

       
        double areaCuadrado = lado * lado;
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double areaTriangulo = (baseT * alturaT) / 2;
        double areaRectangulo = baseR * alturaR;

        
        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
    }

}
