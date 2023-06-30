class RnaTranscription {
    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();

        for (char nucleotide : dnaStrand.toCharArray()) {
            char transcribedNucleotide = transcribeNucleotide(nucleotide);
            rnaStrand.append(transcribedNucleotide);
        }

        return rnaStrand.toString();
    }


    private char transcribeNucleotide(char nucleotide) {
        switch (nucleotide) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
            default:
                throw new IllegalArgumentException("Invalid DNA nucleotide: " + nucleotide);
        }
    }
}
