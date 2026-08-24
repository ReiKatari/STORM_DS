package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ev  reason: default package */
/* loaded from: classes.dex */
public final class ev implements qb6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ev(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new w0((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new lv3(this);
            case 3:
                return (Iterator) obj;
            case 4:
                return new kv3((CharSequence) obj);
            default:
                return new w0((ViewGroup) obj, 10);
        }
    }
}
