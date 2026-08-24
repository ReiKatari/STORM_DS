package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h2  reason: default package */
/* loaded from: classes.dex */
public final class h2 extends d2 {
    public static h2 c;

    @Override // defpackage.d2
    public final int[] f(int i) {
        int length = j().length();
        if (length > 0 && i < length) {
            if (i < 0) {
                i = 0;
            }
            while (i < length && j().charAt(i) == '\n' && (j().charAt(i) == '\n' || (i != 0 && j().charAt(i - 1) != '\n'))) {
                i++;
            }
            if (i >= length) {
                return null;
            }
            int i2 = i + 1;
            while (i2 < length && !s(i2)) {
                i2++;
            }
            return i(i, i2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        return null;
     */
    @Override // defpackage.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] q(int i) {
        int length = j().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && j().charAt(i - 1) == '\n' && !s(i)) {
                i--;
            }
            int i2 = i - 1;
            while (i2 > 0 && (j().charAt(i2) == '\n' || (i2 != 0 && j().charAt(i2 - 1) != '\n'))) {
                i2--;
            }
            return i(i2, i);
        }
        return null;
    }

    public final boolean s(int i) {
        if (i > 0 && j().charAt(i - 1) != '\n') {
            if (i == j().length() || j().charAt(i) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }
}
