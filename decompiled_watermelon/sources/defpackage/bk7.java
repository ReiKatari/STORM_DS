package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayDeque;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bk7  reason: default package */
/* loaded from: classes.dex */
public final class bk7 implements ak7 {
    public final ce0 a;
    public final il6 b = new il6(new t06(18, this));
    public final n85 c = new n85(new vd6(21));
    public boolean d;
    public final boolean e;
    public e55 f;
    public kx2 g;

    public bk7(je0 je0Var) {
        boolean z;
        this.a = je0Var.b;
        if (oe1.a().b(ZslDisablerQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
    }

    @Override // defpackage.ak7
    public final void a() {
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // defpackage.ak7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.x06 r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk7.b(x06):void");
    }

    @Override // defpackage.ak7
    public final boolean d(hc1 hc1Var, d16 d16Var) {
        Size size = hc1Var.h;
        d16Var.getClass();
        InputConfiguration inputConfiguration = d16Var.i;
        if (inputConfiguration != null && hc1Var.i == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ak7
    public final void e(boolean z) {
        if (this.d != z && z) {
            f();
        }
        this.d = z;
    }

    public final void f() {
        boolean isEmpty;
        n85 n85Var = this.c;
        while (true) {
            synchronized (n85Var.L) {
                isEmpty = ((ArrayDeque) n85Var.B).isEmpty();
            }
            if (!isEmpty) {
                ((ow2) n85Var.c()).close();
            } else {
                return;
            }
        }
    }

    public final void g() {
        kx2 kx2Var = this.g;
        if (kx2Var != null) {
            e55 e55Var = this.f;
            if (e55Var != null) {
                jv3.N(kx2Var.e).a(new ai0(e55Var, 4), iq2.x());
                e55Var.f();
                this.f = null;
            }
            kx2Var.a();
            this.g = null;
        }
        f();
    }

    @Override // defpackage.ak7
    public final void c(boolean z) {
    }
}
