package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk7  reason: default package */
/* loaded from: classes.dex */
public abstract class jk7 {
    public static final r90 a = new r90(lk4.a, 0, 0);

    public static final p97 a(wq7 wq7Var, fp fpVar) {
        p97 a2 = wq7Var.a(fpVar);
        int length = fpVar.B.length();
        fp fpVar2 = a2.a;
        mk4 mk4Var = a2.b;
        int length2 = fpVar2.B.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(mk4Var.s(i), length2, i);
        }
        b(mk4Var.s(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(mk4Var.i(i2), length, i2);
        }
        c(mk4Var.i(length2), length, length2);
        return new p97(fpVar2, new r90(mk4Var, fpVar.B.length(), fpVar2.B.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder q = i61.q(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
            q.append(i2);
            q.append(']');
            s53.c(q.toString());
        }
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder q = i61.q(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
            q.append(i2);
            q.append(']');
            s53.c(q.toString());
        }
    }
}
