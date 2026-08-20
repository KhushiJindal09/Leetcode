class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        for (int i = 0; i<boxTypes.length; i++) {
            int boxes = boxTypes[i][0];
            int unitPerBox = boxTypes[i][1];
            int take = Math.min(boxes, truckSize);
            units += take * unitPerBox;
            truckSize -= take;
            if (truckSize == 0) break;
        }
        return units;
    }
}