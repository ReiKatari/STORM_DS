package j7;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public int f7636a;

    /* renamed from: b  reason: collision with root package name */
    public int f7637b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7638c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7639d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7640e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f7641f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f7642g;

    public n1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f7642g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f7636a = -1;
        this.f7637b = Integer.MIN_VALUE;
        this.f7638c = false;
        this.f7639d = false;
        this.f7640e = false;
        int[] iArr = this.f7641f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
