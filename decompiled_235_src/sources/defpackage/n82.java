package defpackage;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n82  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n82 extends po2 implements qn2 {
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.B).accept(windowLayoutInfo);
        return jg7.a;
    }
}
