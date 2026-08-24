package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s76  reason: default package */
/* loaded from: classes.dex */
public final class s76 implements f86 {
    public static final ap3 j = new ap3(28, new l56(22, (byte) 0), new r76(0));
    public final ss4 a;
    public float f;
    public final ss4 b = new ss4(0);
    public final ss4 c = new ss4(0);
    public final r94 d = new r94();
    public final ss4 e = new ss4(Integer.MAX_VALUE);
    public final bf1 g = new bf1(new ro5(this, 7));
    public final ii1 h = np2.I(new on2(this) { // from class: q76
        public final /* synthetic */ s76 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            boolean z = false;
            s76 s76Var = this.B;
            switch (i) {
                case 0:
                    if (s76Var.a.h() < s76Var.e.h()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                default:
                    if (s76Var.a.h() > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
            }
        }
    });
    public final ii1 i = np2.I(new on2(this) { // from class: q76
        public final /* synthetic */ s76 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            boolean z = false;
            s76 s76Var = this.B;
            switch (i) {
                case 0:
                    if (s76Var.a.h() < s76Var.e.h()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                default:
                    if (s76Var.a.h() > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
            }
        }
    });

    public s76(int i) {
        this.a = new ss4(i);
    }

    @Override // defpackage.f86
    public final boolean a() {
        return this.g.a();
    }

    @Override // defpackage.f86
    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final Object d(xa4 xa4Var, eo2 eo2Var, s41 s41Var) {
        Object d = this.g.d(xa4Var, eo2Var, s41Var);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return jg7.a;
    }

    @Override // defpackage.f86
    public final float e(float f) {
        return this.g.e(f);
    }
}
