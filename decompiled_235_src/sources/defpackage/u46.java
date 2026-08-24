package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u46  reason: default package */
/* loaded from: classes.dex */
public final class u46 implements q46, g56 {
    public final /* synthetic */ r46 A;
    public ku3 B;
    public e56 L;

    public u46(r46 r46Var) {
        Bundle bundle;
        this.A = r46Var;
        Object e = r46Var.e("androidx.savedstate.SavedStateRegistry");
        if (e instanceof Bundle) {
            bundle = (Bundle) e;
        } else {
            bundle = null;
        }
        if (bundle != null && this.L == null) {
            e56 e56Var = new e56(new f56(this, new t46(this, 2)));
            this.L = e56Var;
            e56Var.b(bundle);
        }
        r46Var.a("androidx.savedstate.SavedStateRegistry", new t46(this, 0));
    }

    @Override // defpackage.q46
    public final m44 a(String str, on2 on2Var) {
        return this.A.a(str, on2Var);
    }

    @Override // defpackage.q46
    public final boolean c(Object obj) {
        return this.A.c(obj);
    }

    @Override // defpackage.q46
    public final Map d() {
        return this.A.d();
    }

    @Override // defpackage.q46
    public final Object e(String str) {
        return this.A.e(str);
    }

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        ku3 ku3Var = this.B;
        if (ku3Var == null) {
            ku3 ku3Var2 = new ku3(this, false);
            this.B = ku3Var2;
            return ku3Var2;
        }
        return ku3Var;
    }

    @Override // defpackage.g56
    public final d56 getSavedStateRegistry() {
        e56 e56Var = this.L;
        if (e56Var == null) {
            e56 e56Var2 = new e56(new f56(this, new t46(this, 2)));
            this.L = e56Var2;
            e56Var2.b(null);
            e56Var = e56Var2;
        }
        return e56Var.b;
    }
}
