package defpackage;

import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wv0 implements o55 {
    public static final wv0 b = new wv0(0);
    public static final wv0 c = new wv0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ wv0(int i) {
        this.a = i;
    }

    @Override // defpackage.o55
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            default:
                return null;
        }
    }
}
