package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v54  reason: default package */
/* loaded from: classes.dex */
public final class v54 extends di7 {
    public final sg0 q;
    public final al1 r;
    public final Size s;
    public final Object t;
    public mc6 u;
    public o33 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
        r11 = r10[0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v54(sg0 sg0Var, u54 u54Var, al1 al1Var) {
        super(u54Var);
        Size[] outputSizes;
        Size[] sizeArr;
        sg0Var.getClass();
        al1Var.getClass();
        this.q = sg0Var;
        this.r = al1Var;
        Size size = w54.a;
        lg0 lg0Var = sg0Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((qc0) lg0Var).c(key);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            if (kj2.G()) {
                Log.e("CXCP", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = xu6.a;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) si1.a().b(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (xu6.b.compare(size4, xu6.a) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length == 0) {
                if (kj2.L()) {
                    Log.w("CXCP", "No supported output size list, fallback to current list");
                }
            } else {
                outputSizes = sizeArr;
            }
            if (outputSizes.length > 1) {
                zh2 zh2Var = new zh2(21);
                if (outputSizes.length > 1) {
                    Arrays.sort(outputSizes, zh2Var);
                }
            }
            Size c = al1Var.c();
            long min = Math.min(307200L, c.getWidth() * c.getHeight());
            int length = outputSizes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size5 = outputSizes[i];
                int i2 = ((size5.getWidth() * size5.getHeight()) > min ? 1 : ((size5.getWidth() * size5.getHeight()) == min ? 0 : -1));
                if (i2 == 0) {
                    size = size5;
                    break;
                } else if (i2 <= 0) {
                    i++;
                    size2 = size5;
                }
            }
        }
        this.s = size;
        this.t = new Object();
    }

    @Override // defpackage.di7
    public final void A() {
        mc6 mc6Var = this.u;
        if (mc6Var != null) {
            mc6Var.b();
        }
        this.u = null;
        synchronized (this.t) {
            try {
                o33 o33Var = this.v;
                if (o33Var != null) {
                    o33Var.a();
                }
                this.v = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o33 G(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        o33 o33Var = this.v;
        if (o33Var != null) {
            o33Var.a();
        }
        o33 o33Var2 = new o33(surface, size, this.h.q());
        this.v = o33Var2;
        l.F(o33Var2.e).a(u24.j(), new mf(29, surface, surfaceTexture));
        return o33Var2;
    }

    public final lc6 H(Size size) {
        o33 G;
        synchronized (this.t) {
            G = G(size);
        }
        mc6 mc6Var = this.u;
        if (mc6Var != null) {
            mc6Var.b();
        }
        mc6 mc6Var2 = new mc6(new n13(this, size, 1));
        this.u = mc6Var2;
        lc6 d = lc6.d(new u54(), size);
        d.b.L = 1;
        d.b(G, yq1.d, -1);
        d.f = mc6Var2;
        return d;
    }

    @Override // defpackage.di7
    public final zi7 g(boolean z, cj7 cj7Var) {
        cj7Var.getClass();
        this.q.getClass();
        this.r.getClass();
        return new u54();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [yi7, java.lang.Object] */
    @Override // defpackage.di7
    public final yi7 m(yy0 yy0Var) {
        yy0Var.getClass();
        this.q.getClass();
        this.r.getClass();
        return new Object();
    }

    @Override // defpackage.di7
    public final yy z(yy yyVar, yy yyVar2) {
        Size size = this.s;
        E(hf.b0(H(size).c()));
        p87 b = yyVar.b();
        b.a = size;
        return b.a();
    }
}
