package a0;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import d0.i1;
import j0.g1;
import j0.p0;
import j0.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import me.magnum.melonds.MelonEmulator;
import oe.a0;
import oe.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements eh.k, q9.i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11a;

    public m(int i2) {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (i2) {
            case 2:
                if (z.a.f14847a.j(TorchIsClosedAfterImageCapturingQuirk.class) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11a = z10;
                return;
            case 3:
            default:
                if (((StillCaptureFlashStopRepeatingQuirk) z.a.f14847a.j(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f11a = z12;
                return;
            case 4:
                if (o0.a.f10495a.j(SurfaceOrderQuirk.class) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f11a = z11;
                return;
        }
    }

    public static p0 f(p0 p0Var) {
        i1 i1Var = new i1();
        i1Var.A = p0Var.f7276c;
        for (u0 u0Var : Collections.unmodifiableList(p0Var.f7274a)) {
            ((HashSet) i1Var.L).add(u0Var);
        }
        i1Var.i(p0Var.f7275b);
        g1 b10 = g1.b();
        b10.o(v.a.Z(CaptureRequest.FLASH_MODE), 0);
        i1Var.i(new b(13, j0.i1.a(b10)));
        return i1Var.j();
    }

    @Override // q9.i
    public boolean a(n9.g gVar) {
        return this.f11a;
    }

    @Override // eh.k
    public void b(a0 a0Var) {
        a0Var.getClass();
        MelonEmulator.f9466a.onScreenTouch(a0Var.f10908a, a0Var.f10909b);
    }

    @Override // q9.i
    public boolean c() {
        return this.f11a;
    }

    @Override // eh.k
    public void d(s sVar) {
        sVar.getClass();
        if (sVar != s.HINGE) {
            MelonEmulator.f9466a.e(sVar);
        }
    }

    @Override // eh.k
    public void e(s sVar) {
        sVar.getClass();
        s sVar2 = s.HINGE;
        MelonEmulator melonEmulator = MelonEmulator.f9466a;
        if (sVar == sVar2) {
            boolean z10 = this.f11a;
            this.f11a = !z10;
            if (!z10) {
                melonEmulator.d(sVar2);
                return;
            } else {
                melonEmulator.e(sVar2);
                return;
            }
        }
        melonEmulator.d(sVar);
    }

    public boolean g(ArrayList arrayList, boolean z10) {
        if (this.f11a && z10) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Integer num = (Integer) ((CaptureRequest) obj).get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(java.util.ArrayList r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.f11a
            r1 = 0
            if (r0 == 0) goto L2b
            if (r6 != 0) goto L8
            goto L2b
        L8:
            int r6 = r5.size()
            r0 = r1
        Ld:
            if (r0 >= r6) goto L2b
            java.lang.Object r2 = r5.get(r0)
            int r0 = r0 + 1
            android.hardware.camera2.CaptureRequest r2 = (android.hardware.camera2.CaptureRequest) r2
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 2
            if (r2 == r3) goto L29
            r3 = 3
            if (r2 != r3) goto Ld
        L29:
            r5 = 1
            return r5
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.m.h(java.util.ArrayList, boolean):boolean");
    }

    public m(boolean z10) {
        this.f11a = z10;
    }
}
