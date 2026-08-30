package h5;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f6081a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f6082b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f6083c = null;

    /* renamed from: d  reason: collision with root package name */
    public HashMap f6084d;

    public abstract void a(HashMap hashMap);

    public abstract b b();

    public b c(b bVar) {
        this.f6081a = bVar.f6081a;
        this.f6082b = bVar.f6082b;
        this.f6083c = bVar.f6083c;
        this.f6084d = bVar.f6084d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap hashMap) {
    }
}
