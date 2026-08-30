package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11262a = 2500;

    /* renamed from: b  reason: collision with root package name */
    public static final float f11263b = 1500;

    /* renamed from: c  reason: collision with root package name */
    public static final float f11264c = 50;

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(10:18|19|20|21|22|23|24|(3:26|27|28)|13|14))(5:91|(1:93)|94|95|(10:97|98|(1:100)(1:103)|101|102|23|24|(0)|13|14)(2:104|105))))|111|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db A[Catch: i -> 0x01a3, TRY_ENTER, TRY_LEAVE, TryCatch #4 {i -> 0x01a3, blocks: (B:33:0x00bd, B:40:0x00db, B:54:0x0100, B:56:0x0114, B:60:0x0129, B:64:0x0131), top: B:108:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, nc.r] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Object, nc.q] */
    /* JADX WARN: Type inference failed for: r8v2, types: [nc.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x017a -> B:74:0x0185). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n1.s r27, int r28, int r29, x4.c r30, ec.c r31) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.t0.a(n1.s, int, int, x4.c, ec.c):java.lang.Object");
    }

    public static final boolean b(boolean z10, n1.s sVar, int i2) {
        if (z10) {
            if (sVar.c() <= i2) {
                if (sVar.c() == i2 && sVar.d() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        } else if (sVar.c() >= i2) {
            if (sVar.c() == i2 && sVar.d() < 0) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    public static final boolean c(n1.s sVar, int i2) {
        int c4 = sVar.c();
        if (i2 > sVar.e() || c4 > i2) {
            return false;
        }
        return true;
    }
}
