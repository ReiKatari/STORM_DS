package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fw5  reason: default package */
/* loaded from: classes.dex */
public final class fw5 implements sw5 {
    public static final ci3 j = new ci3(22, new gu5(7), new fu5(19));
    public final qj4 a;
    public float f;
    public final qj4 b = new qj4(0);
    public final qj4 c = new qj4(0);
    public final l14 d = new l14();
    public final qj4 e = new qj4(Preference.DEFAULT_ORDER);
    public final db1 g = new db1(new n95(9, this));
    public final ee1 h = me2.q(new ki2(this) { // from class: ew5
        public final /* synthetic */ fw5 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            boolean z = false;
            fw5 fw5Var = this.B;
            switch (i) {
                case 0:
                    if (fw5Var.a.h() < fw5Var.e.h()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                default:
                    if (fw5Var.a.h() > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
            }
        }
    });
    public final ee1 i = me2.q(new ki2(this) { // from class: ew5
        public final /* synthetic */ fw5 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            boolean z = false;
            fw5 fw5Var = this.B;
            switch (i) {
                case 0:
                    if (fw5Var.a.h() < fw5Var.e.h()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                default:
                    if (fw5Var.a.h() > 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
            }
        }
    });

    public fw5(int i) {
        this.a = new qj4(i);
    }

    @Override // defpackage.sw5
    public final boolean a() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final boolean b() {
        return this.g.b();
    }

    @Override // defpackage.sw5
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final float d(float f) {
        return this.g.d(f);
    }

    @Override // defpackage.sw5
    public final Object e(r24 r24Var, aj2 aj2Var, j11 j11Var) {
        Object e = this.g.e(r24Var, aj2Var, j11Var);
        if (e == p31.COROUTINE_SUSPENDED) {
            return e;
        }
        return o27.a;
    }
}
