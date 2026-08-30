package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s83  reason: default package */
/* loaded from: classes.dex */
public final class s83 extends u0 {
    public final y63 Y;
    public final int Z;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s83(t63 t63Var, y63 y63Var) {
        super(t63Var, null);
        t63Var.getClass();
        this.Y = y63Var;
        this.Z = y63Var.A.size();
        this.c0 = -1;
    }

    @Override // defpackage.u0
    public final k73 C() {
        return this.Y;
    }

    @Override // defpackage.u0
    public final k73 d(String str) {
        str.getClass();
        return (k73) this.Y.A.get(Integer.parseInt(str));
    }

    @Override // defpackage.yu0
    public final int v(h06 h06Var) {
        h06Var.getClass();
        int i = this.c0;
        if (i < this.Z - 1) {
            int i2 = i + 1;
            this.c0 = i2;
            return i2;
        }
        return -1;
    }

    @Override // defpackage.u0
    public final String z(h06 h06Var, int i) {
        h06Var.getClass();
        return String.valueOf(i);
    }
}
