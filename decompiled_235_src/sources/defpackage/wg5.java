package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg5  reason: default package */
/* loaded from: classes.dex */
public abstract class wg5 {
    public static final List t = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int j;
    public RecyclerView r;
    public wf5 s;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public wg5 h = null;
    public wg5 i = null;
    public ArrayList k = null;
    public List l = null;
    public int m = 0;
    public mg5 n = null;
    public boolean o = false;
    public int p = 0;
    public int q = -1;

    public wg5(View view) {
        if (view != null) {
            this.a = view;
        } else {
            i.h("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.j = i | this.j;
    }

    public final int b() {
        int i = this.g;
        if (i == -1) {
            return this.c;
        }
        return i;
    }

    public final List c() {
        ArrayList arrayList;
        if ((this.j & 1024) == 0 && (arrayList = this.k) != null && arrayList.size() != 0) {
            return this.l;
        }
        return t;
    }

    public final boolean d() {
        View view = this.a;
        if (view.getParent() != null && view.getParent() != this.r) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if ((this.j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = ao7.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if ((this.j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.n != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void l(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((hg5) view.getLayoutParams()).c = true;
        }
    }

    public final void m() {
        if (RecyclerView.y1 && j()) {
            e41.o(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z) {
        int i;
        int i2 = this.m;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.m = i;
        if (i < 0) {
            this.m = 0;
            if (!RecyclerView.y1) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                e41.p(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                return;
            }
        } else if (!z && i == 1) {
            this.j |= 16;
        } else if (z && i == 0) {
            this.j &= -17;
        }
        if (RecyclerView.z1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean o() {
        if ((this.j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.j & 32) != 0) {
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
        StringBuilder r = i61.r(simpleName, "{");
        r.append(Integer.toHexString(hashCode()));
        r.append(" position=");
        r.append(this.c);
        r.append(" id=");
        r.append(this.e);
        r.append(", oldPos=");
        r.append(this.d);
        r.append(", pLpos:");
        r.append(this.g);
        StringBuilder sb = new StringBuilder(r.toString());
        if (i()) {
            sb.append(" scrap ");
            if (this.o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
