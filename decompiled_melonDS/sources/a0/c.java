package a0;

import android.text.TextUtils;
import m6.u;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements m6.m {
    public final /* synthetic */ int A;
    public String B;

    public /* synthetic */ c(String str, int i2) {
        this.A = i2;
        this.B = str;
    }

    @Override // m6.m
    public boolean f(CharSequence charSequence, int i2, int i10, u uVar) {
        if (TextUtils.equals(charSequence.subSequence(i2, i10), this.B)) {
            uVar.f9307c = (uVar.f9307c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return w.d.r(new StringBuilder("<"), this.B, '>');
            default:
                return super.toString();
        }
    }

    @Override // m6.m
    public Object a() {
        return this;
    }
}
