package y3;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 implements s1, o {
    public static final a1 B = new a1(0);
    public final /* synthetic */ int A;

    public /* synthetic */ a1(int i2) {
        this.A = i2;
    }

    @Override // y3.o
    public long a(long j2, long j10) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                int i2 = m1.f14708a;
                return floatToRawIntBits;
            case 2:
                float d4 = c0.d(j2, j10);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(d4) << 32) | (Float.floatToRawIntBits(d4) & 4294967295L);
                int i10 = m1.f14708a;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j2 >> 32)) <= Float.intBitsToFloat((int) (j10 >> 32)) && Float.intBitsToFloat((int) (j2 & 4294967295L)) <= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i11 = m1.f14708a;
                    return floatToRawIntBits3;
                }
                float d10 = c0.d(j2, j10);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(d10) << 32) | (Float.floatToRawIntBits(d10) & 4294967295L);
                int i12 = m1.f14708a;
                return floatToRawIntBits4;
        }
    }

    @Override // y3.s1
    public void i(a1.a1 a1Var) {
        a1Var.clear();
    }

    @Override // y3.s1
    public boolean o(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.A) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
