package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fa0  reason: default package */
/* loaded from: classes.dex */
public final class fa0 implements ux3, m37 {
    public final String A;
    public final int B;
    public final CameraExtensionCharacteristics L;
    public final gh3 R;

    public fa0(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        str.getClass();
        this.A = str;
        this.B = i;
        this.L = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        wk3 wk3Var = wk3.PUBLICATION;
        yf2.H(wk3Var, new ea0(this, 0));
        yf2.H(wk3Var, new ea0(this, 1));
        this.R = yf2.H(wk3Var, new ea0(this, 2));
        yf2.H(wk3Var, new ea0(this, 3));
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(dd.q()))) {
            return this.L;
        }
        return null;
    }
}
