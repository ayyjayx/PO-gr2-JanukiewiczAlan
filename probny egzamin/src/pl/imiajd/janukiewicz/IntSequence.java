package pl.imiajd.janukiewicz;

interface IntSequence {

    boolean hasNext();
    int next();
    static IntSequence of(int...args){
        class Sequence implements IntSequence{
            private int[] seq = args;
            int counter = 0;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                if (this.counter < this.seq.length) {
                    this.counter++;
                    return this.seq[counter-1];
                }
                else {
                    return 1;
                }
            }
        }
        IntSequence result = new Sequence();
        Sequence inner = (Sequence) result;
        return inner;
    }

    static IntSequence squares (int n){
        IntSequence sq = new IntSequence() {
            int counter = n;
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                this.counter++;
                return (int) Math.pow(this.counter-1, 2);
            }
        };
        return sq;
    }
}
