package j7;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c1.h2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: t  reason: collision with root package name */
    public static final List f7593t = Collections.EMPTY_LIST;

    /* renamed from: a  reason: collision with root package name */
    public final View f7594a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f7595b;

    /* renamed from: j  reason: collision with root package name */
    public int f7603j;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f7610r;

    /* renamed from: s  reason: collision with root package name */
    public k0 f7611s;

    /* renamed from: c  reason: collision with root package name */
    public int f7596c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f7597d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f7598e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f7599f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f7600g = -1;

    /* renamed from: h  reason: collision with root package name */
    public j1 f7601h = null;

    /* renamed from: i  reason: collision with root package name */
    public j1 f7602i = null;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f7604k = null;

    /* renamed from: l  reason: collision with root package name */
    public List f7605l = null;
    public int m = 0;

    /* renamed from: n  reason: collision with root package name */
    public h2 f7606n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7607o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f7608p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f7609q = -1;

    public j1(View view) {
        if (view != null) {
            this.f7594a = view;
        } else {
            a0.j.h("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i2) {
        this.f7603j = i2 | this.f7603j;
    }

    public final int b() {
        int i2 = this.f7600g;
        if (i2 == -1) {
            return this.f7596c;
        }
        return i2;
    }

    public final List c() {
        ArrayList arrayList;
        if ((this.f7603j & 1024) == 0 && (arrayList = this.f7604k) != null && arrayList.size() != 0) {
            return this.f7605l;
        }
        return f7593t;
    }

    public final boolean d() {
        View view = this.f7594a;
        if (view.getParent() != null && view.getParent() != this.f7610r) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if ((this.f7603j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.f7603j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f7603j & 16) == 0) {
            WeakHashMap weakHashMap = a6.x0.f533a;
            if (!this.f7594a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f7603j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.f7606n != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f7603j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.f7603j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void l(int i2, boolean z10) {
        if (this.f7597d == -1) {
            this.f7597d = this.f7596c;
        }
        if (this.f7600g == -1) {
            this.f7600g = this.f7596c;
        }
        if (z10) {
            this.f7600g += i2;
        }
        this.f7596c += i2;
        View view = this.f7594a;
        if (view.getLayoutParams() != null) {
            ((v0) view.getLayoutParams()).f7724c = true;
        }
    }

    public final void m() {
        if (RecyclerView.f1616v1 && j()) {
            a0.j.o(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.f7603j = 0;
        this.f7596c = -1;
        this.f7597d = -1;
        this.f7598e = -1L;
        this.f7600g = -1;
        this.m = 0;
        this.f7601h = null;
        this.f7602i = null;
        ArrayList arrayList = this.f7604k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f7603j &= -1025;
        this.f7608p = 0;
        this.f7609q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z10) {
        int i2;
        int i10 = this.m;
        if (z10) {
            i2 = i10 - 1;
        } else {
            i2 = i10 + 1;
        }
        this.m = i2;
        if (i2 < 0) {
            this.m = 0;
            if (!RecyclerView.f1616v1) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z10 && i2 == 1) {
            this.f7603j |= 16;
        } else if (z10 && i2 == 0) {
            this.f7603j &= -17;
        }
        if (RecyclerView.f1617w1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
        }
    }

    public final boolean o() {
        if ((this.f7603j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.f7603j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f7596c + " id=" + this.f7598e + ", oldPos=" + this.f7597d + ", pLpos:" + this.f7600g);
        if (i()) {
            sb2.append(" scrap ");
            if (this.f7607o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (f()) {
            sb2.append(" invalid");
        }
        if (!e()) {
            sb2.append(" unbound");
        }
        if ((this.f7603j & 2) != 0) {
            sb2.append(" update");
        }
        if (h()) {
            sb2.append(" removed");
        }
        if (o()) {
            sb2.append(" ignored");
        }
        if (j()) {
            sb2.append(" tmpDetached");
        }
        if (!g()) {
            sb2.append(" not recyclable(" + this.m + ")");
        }
        if ((this.f7603j & 512) != 0 || f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f7594a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
