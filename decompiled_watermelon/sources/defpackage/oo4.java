package defpackage;

import android.widget.Magnifier;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oo4  reason: default package */
/* loaded from: classes.dex */
public final class oo4 extends mo4 {
    @Override // defpackage.mo4, defpackage.ko4
    public final void a(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.a.setZoom(Float.NaN);
        }
        int i = ((9223372034707292159L & j2) > 9205357640488583168L ? 1 : ((9223372034707292159L & j2) == 9205357640488583168L ? 0 : -1));
        Magnifier magnifier = this.a;
        if (i != 0) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
