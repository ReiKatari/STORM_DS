package v5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13734a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13735b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f13736c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f13737d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f13738e;

    public /* synthetic */ d(String str, Context context, Object obj, int i2, int i10) {
        this.f13734a = i10;
        this.f13735b = str;
        this.f13736c = context;
        this.f13738e = obj;
        this.f13737d = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13734a) {
            case 0:
                ArrayList arrayList = new ArrayList(1);
                Object obj = new Object[]{(c) this.f13738e}[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return f.b(this.f13735b, this.f13736c, Collections.unmodifiableList(arrayList), this.f13737d);
            default:
                try {
                    return f.b(this.f13735b, this.f13736c, (ArrayList) this.f13738e, this.f13737d);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
