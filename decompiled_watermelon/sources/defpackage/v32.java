package defpackage;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v32  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v32 extends lj2 implements mi2 {
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.B).accept(windowLayoutInfo);
        return o27.a;
    }
}
