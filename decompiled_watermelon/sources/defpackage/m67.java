package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m67  reason: default package */
/* loaded from: classes.dex */
public abstract class m67 {
    public static final k70 a = new k70(ob4.a, 0, 0);

    public static final uw6 a(uc7 uc7Var, to toVar) {
        uw6 a2 = uc7Var.a(toVar);
        int length = toVar.B.length();
        to toVar2 = a2.a;
        pb4 pb4Var = a2.b;
        int length2 = toVar2.B.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(pb4Var.r(i), length2, i);
        }
        b(pb4Var.r(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(pb4Var.n(i2), length, i2);
        }
        c(pb4Var.n(length2), length, length2);
        return new uw6(toVar2, new k70(pb4Var, toVar.B.length(), toVar2.B.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder s = b31.s(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
            s.append(i2);
            s.append(']');
            pz2.c(s.toString());
        }
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder s = b31.s(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
            s.append(i2);
            s.append(']');
            pz2.c(s.toString());
        }
    }
}
