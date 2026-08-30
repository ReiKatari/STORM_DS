package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f8842a = p7.t.o(14);

    /* renamed from: b  reason: collision with root package name */
    public static final long f8843b = p7.t.o(0);

    /* renamed from: c  reason: collision with root package name */
    public static final long f8844c = i3.s.f6686g;

    /* renamed from: d  reason: collision with root package name */
    public static final w4.o f8845d;

    static {
        w4.o oVar;
        long j2 = i3.s.f6681b;
        if (j2 != 16) {
            oVar = new w4.c(j2);
        } else {
            oVar = w4.n.f14148a;
        }
        f8845d = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
        if (r15.equals(r24.f8835i) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (r39.equals(r24.f8836j) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
        if (r40.equals(r24.f8837k) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final l4.j0 a(l4.j0 r24, long r25, i3.o r27, float r28, long r29, p4.j r31, p4.h r32, p4.i r33, p4.p r34, java.lang.String r35, long r36, w4.a r38, w4.p r39, s4.b r40, long r41, w4.l r43, i3.m0 r44, l4.z r45, k3.e r46) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.k0.a(l4.j0, long, i3.o, float, long, p4.j, p4.h, p4.i, p4.p, java.lang.String, long, w4.a, w4.p, s4.b, long, w4.l, i3.m0, l4.z, k3.e):l4.j0");
    }

    public static final Object b(Object obj, Object obj2, float f8) {
        if (f8 < 0.5d) {
            return obj;
        }
        return obj2;
    }

    public static final long c(float f8, long j2, long j10) {
        int i2;
        x4.p[] pVarArr = x4.o.f14348b;
        long j11 = j2 & 1095216660480L;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 == 0 || (1095216660480L & j10) == 0) {
            return ((x4.o) b(new x4.o(j2), new x4.o(j10), f8)).f14350a;
        }
        if (i10 == 0 || i2 == 0) {
            x4.i.a("Cannot perform operation for Unspecified type.");
        }
        if (!x4.p.a(x4.o.b(j2), x4.o.b(j10))) {
            x4.i.a("Cannot perform operation for " + ((Object) x4.p.b(x4.o.b(j2))) + " and " + ((Object) x4.p.b(x4.o.b(j10))));
        }
        return p7.t.C(j11, p7.l.w(x4.o.c(j2), x4.o.c(j10), f8));
    }
}
