package com.hkk.simple;

/**
 * @author kang
 * @date 2023/3/13
 */
public class MinNumberOfHours {

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int energyTotalTrain = 0;
        int experienceTotalTrain = 0;
        for (int i = 0; i < energy.length; i++) {
            if (initialEnergy > energy[i] && initialExperience > experience[i]) {
                initialExperience = initialExperience + experience[i];
                initialEnergy = initialEnergy - energy[i];
            } else if (initialEnergy <= energy[i] && initialExperience > experience[i]) {
                final int energyTrain = energy[i] - initialEnergy + 1;
                energyTotalTrain = energyTotalTrain + energyTrain;
                initialEnergy = 1;
                initialExperience = initialExperience + experience[i];
            } else if (initialEnergy > energy[i] && initialExperience <= experience[i]) {
                final int experienceTrain = experience[i] - initialExperience + 1;
                experienceTotalTrain = experienceTotalTrain + experienceTrain;
                initialEnergy = initialEnergy - energy[i];
                initialExperience = experienceTrain + initialExperience + experience[i];
            } else {
                final int energyTrain = energy[i] - initialEnergy + 1;
                energyTotalTrain = energyTotalTrain + energyTrain;
                final int experienceTrain = experience[i] - initialExperience + 1;
                experienceTotalTrain = experienceTotalTrain + experienceTrain;
                initialEnergy = 1;
                initialExperience = experienceTrain + initialExperience + experience[i];
            }
        }
        return energyTotalTrain + experienceTotalTrain;
    }


    public static void main(String[] args) {
        int[] energy = new int[]{1, 1, 1, 1};
        int[] experience = new int[]{1, 1, 1, 50};
        System.out.println(new MinNumberOfHours().minNumberOfHours(1, 1, energy, experience));
    }
}
