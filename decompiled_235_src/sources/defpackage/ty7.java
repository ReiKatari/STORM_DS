package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ty7  reason: default package */
/* loaded from: classes.dex */
public final class ty7 implements sy7 {
    public final lg0 a;
    public final ex6 b = new ex6(new t46(this, 26));
    public final m44 c = new m44(new fa6(22));
    public boolean d;
    public final boolean e;
    public re5 f;
    public o33 g;

    public ty7(sg0 sg0Var) {
        boolean z;
        this.a = sg0Var.b;
        if (si1.a().b(ZslDisablerQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
    }

    @Override // defpackage.sy7
    public final void a() {
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    @Override // defpackage.sy7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(lc6 lc6Var) {
        Size size;
        dk0 dk0Var = lc6Var.b;
        g();
        if (this.d) {
            dk0Var.L = 1;
        } else if (this.e) {
            dk0Var.L = 1;
        } else {
            lg0.g.getClass();
            lg0 lg0Var = this.a;
            lg0Var.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((qc0) lg0Var).c(key);
            if (iArr == null) {
                iArr = kg0.b;
            }
            if (!fv.m0(iArr, 4)) {
                if (kj2.H()) {
                    Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
                }
                dk0Var.L = 1;
                return;
            }
            ex6 ex6Var = this.b;
            Size[] inputSizes = ((StreamConfigurationMap) ex6Var.getValue()).getInputSizes(34);
            inputSizes.getClass();
            Iterator it = fv.T0(inputSizes).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Size size2 = (Size) next;
                    size2.getClass();
                    int height = size2.getHeight() * size2.getWidth();
                    do {
                        Object next2 = it.next();
                        Size size3 = (Size) next2;
                        size3.getClass();
                        int height2 = size3.getHeight() * size3.getWidth();
                        if (height < height2) {
                            next = next2;
                            height = height2;
                        }
                    } while (it.hasNext());
                    size = (Size) next;
                    if (size != null) {
                    }
                } else {
                    size = (Size) next;
                    if (size != null) {
                        if (kj2.L()) {
                            Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                            return;
                        }
                        return;
                    }
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size);
                    }
                    int[] validOutputFormatsForInput = ((StreamConfigurationMap) ex6Var.getValue()).getValidOutputFormatsForInput(34);
                    validOutputFormatsForInput.getClass();
                    if (!fv.m0(validOutputFormatsForInput, 256)) {
                        if (kj2.L()) {
                            Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                            return;
                        }
                        return;
                    }
                    o54 o54Var = new o54(size.getWidth(), size.getHeight(), 34, 9);
                    ce0 ce0Var = o54Var.B;
                    ce0Var.getClass();
                    re5 re5Var = new re5(o54Var);
                    o54Var.e(new h61(this, 24), u24.u());
                    Surface surface = re5Var.getSurface();
                    if (surface != null) {
                        o33 o33Var = new o33(surface, new Size(re5Var.getWidth(), re5Var.getHeight()), 34);
                        l.F(o33Var.e).a(u24.x(), new ik0(re5Var, 3));
                        lc6Var.b(o33Var, yq1.d, -1);
                        dk0Var.d(ce0Var);
                        ArrayList arrayList = lc6Var.e;
                        if (!arrayList.contains(ce0Var)) {
                            arrayList.add(ce0Var);
                        }
                        lc6Var.g = new InputConfiguration(re5Var.getWidth(), re5Var.getHeight(), re5Var.b());
                        this.f = re5Var;
                        this.g = o33Var;
                        return;
                    }
                    i.m("Required value was null.");
                }
            } else {
                fa6.c();
            }
        }
    }

    @Override // defpackage.sy7
    public final void d(boolean z) {
        if (this.d != z && z) {
            f();
        }
        this.d = z;
    }

    @Override // defpackage.sy7
    public final boolean e(ig1 ig1Var, rc6 rc6Var) {
        Size size = ig1Var.h;
        rc6Var.getClass();
        InputConfiguration inputConfiguration = rc6Var.i;
        if (inputConfiguration != null && ig1Var.i == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight()) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean isEmpty;
        m44 m44Var = this.c;
        while (true) {
            synchronized (m44Var.L) {
                isEmpty = ((ArrayDeque) m44Var.B).isEmpty();
            }
            if (!isEmpty) {
                ((s23) m44Var.e()).close();
            } else {
                return;
            }
        }
    }

    public final void g() {
        o33 o33Var = this.g;
        if (o33Var != null) {
            re5 re5Var = this.f;
            if (re5Var != null) {
                l.F(o33Var.e).a(u24.x(), new ik0(re5Var, 4));
                re5Var.d();
                this.f = null;
            }
            o33Var.a();
            this.g = null;
        }
        f();
    }

    @Override // defpackage.sy7
    public final void c(boolean z) {
    }
}
