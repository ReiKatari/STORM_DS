package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m83  reason: default package */
/* loaded from: classes.dex */
public final class m83 extends u0 {
    public final k73 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m83(t63 t63Var, k73 k73Var, String str) {
        super(t63Var, str);
        t63Var.getClass();
        k73Var.getClass();
        this.Y = k73Var;
        this.A.add("primitive");
    }

    @Override // defpackage.u0
    public final k73 C() {
        return this.Y;
    }

    @Override // defpackage.u0
    public final k73 d(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.Y;
        }
        i.i("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // defpackage.yu0
    public final int v(h06 h06Var) {
        h06Var.getClass();
        return 0;
    }
}
