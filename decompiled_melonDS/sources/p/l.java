package p;

import a6.y0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class l implements Menu {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f11109y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f11110a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f11111b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11112c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11113d;

    /* renamed from: e  reason: collision with root package name */
    public j f11114e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11115f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f11116g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f11117h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f11118i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f11119j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11120k;
    public CharSequence m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f11122n;

    /* renamed from: o  reason: collision with root package name */
    public View f11123o;

    /* renamed from: v  reason: collision with root package name */
    public n f11130v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11132x;

    /* renamed from: l  reason: collision with root package name */
    public int f11121l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f11124p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11125q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11126r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11127s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f11128t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f11129u = new CopyOnWriteArrayList();

    /* renamed from: w  reason: collision with root package name */
    public boolean f11131w = false;

    public l(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f11110a = context;
        Resources resources = context.getResources();
        this.f11111b = resources;
        this.f11115f = new ArrayList();
        this.f11116g = new ArrayList();
        this.f11117h = true;
        this.f11118i = new ArrayList();
        this.f11119j = new ArrayList();
        this.f11120k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = y0.f540a;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = a6.k.t(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f11113d = z11;
    }

    public final n a(int i2, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0 && i13 < 6) {
            int i14 = (f11109y[i13] << 16) | (65535 & i11);
            n nVar = new n(this, i2, i10, i11, i14, charSequence, this.f11121l);
            ArrayList arrayList = this.f11115f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((n) arrayList.get(size)).f11136d <= i14) {
                        i12 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i12 = 0;
                    break;
                }
            }
            arrayList.add(i12, nVar);
            p(true);
            return nVar;
        }
        a0.j.h("order does not contain a valid category.");
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f11111b.getString(i2));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        Intent intent2;
        int i14;
        PackageManager packageManager = this.f11110a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i13 = queryIntentActivityOptions.size();
        } else {
            i13 = 0;
        }
        if ((i12 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            if (i16 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i16];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n a10 = a(i2, i10, i11, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f11139g = intent3;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a10;
            }
        }
        return i13;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i10, int i11, CharSequence charSequence) {
        n a10 = a(i2, i10, i11, charSequence);
        d0 d0Var = new d0(this.f11110a, this, a10);
        a10.f11146o = d0Var;
        d0Var.setHeaderTitle(a10.f11137e);
        return d0Var;
    }

    public final void b(x xVar, Context context) {
        this.f11129u.add(new WeakReference(xVar));
        xVar.g(context, this);
        this.f11120k = true;
    }

    public final void c(boolean z10) {
        if (this.f11127s) {
            return;
        }
        this.f11127s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11129u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.a(this, z10);
            }
        }
        this.f11127s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f11130v;
        if (nVar != null) {
            d(nVar);
        }
        this.f11115f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f11122n = null;
        this.m = null;
        this.f11123o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11129u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f11130v == nVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = xVar.k(nVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f11130v = null;
            }
        }
        return z10;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f11114e;
        if (jVar != null && jVar.e(lVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11129u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = xVar.h(nVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f11130v = nVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f11115f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f11133a == i2) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f11146o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final n g(int i2, KeyEvent keyEvent) {
        char c4;
        ArrayList arrayList = this.f11128t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (n10) {
                c4 = nVar.f11142j;
            } else {
                c4 = nVar.f11140h;
            }
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (n10 && c4 == '\b' && i2 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f11115f.get(i2);
    }

    public final void h(List list, int i2, KeyEvent keyEvent) {
        char c4;
        int i10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.f11115f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList.get(i11);
                if (nVar.hasSubMenu()) {
                    nVar.f11146o.h(list, i2, keyEvent);
                }
                if (n10) {
                    c4 = nVar.f11142j;
                } else {
                    c4 = nVar.f11140h;
                }
                if (n10) {
                    i10 = nVar.f11143k;
                } else {
                    i10 = nVar.f11141i;
                }
                if ((modifiers & 69647) == (i10 & 69647) && c4 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c4 == cArr[0] || c4 == cArr[2] || (n10 && c4 == '\b' && i2 == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (!this.f11132x) {
            ArrayList arrayList = this.f11115f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((n) arrayList.get(i2)).isVisible()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f11120k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11129u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 |= xVar.i();
            }
        }
        ArrayList arrayList = this.f11118i;
        ArrayList arrayList2 = this.f11119j;
        if (z10) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i2 = 0; i2 < size; i2++) {
                n nVar = (n) l10.get(i2);
                if ((nVar.f11155x & 32) == 32) {
                    arrayList.add(nVar);
                } else {
                    arrayList2.add(nVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f11120k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        if (g(i2, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.f11117h;
        ArrayList arrayList = this.f11116g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f11115f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = (n) arrayList2.get(i2);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f11117h = false;
        this.f11120k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f11131w;
    }

    public boolean n() {
        return this.f11112c;
    }

    public boolean o() {
        return this.f11113d;
    }

    public final void p(boolean z10) {
        if (!this.f11124p) {
            if (z10) {
                this.f11117h = true;
                this.f11120k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f11129u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    x xVar = (x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        xVar.d();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f11125q = true;
        if (z10) {
            this.f11126r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i10) {
        return q(findItem(i2), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i10) {
        boolean z10;
        n g10 = g(i2, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i10);
        } else {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, p.x r8, int r9) {
        /*
            r6 = this;
            p.n r7 = (p.n) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            p.l r1 = r7.f11145n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f11147p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.f11139g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f11110a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            p.o r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f11159b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            p.o r2 = r7.A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f11159b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            p.d0 r9 = new p.d0
            android.content.Context r5 = r6.f11110a
            r9.<init>(r5, r6, r7)
            r7.f11146o = r9
            java.lang.CharSequence r5 = r7.f11137e
            r9.setHeaderTitle(r5)
        L90:
            p.d0 r7 = r7.f11146o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f11159b
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f11129u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.f(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            p.x r4 = (p.x) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.f(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l.q(android.view.MenuItem, p.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11129u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f11115f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((n) arrayList.get(i11)).f11134b == i2) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((n) arrayList.get(i11)).f11134b != i2) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f11115f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((n) arrayList.get(i10)).f11133a == i2) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f11115f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((d0) item.getSubMenu()).s(bundle);
                }
            }
            int i10 = bundle.getInt("android:menu:expandedactionview");
            if (i10 > 0 && (findItem = findItem(i10)) != null) {
                findItem.expandActionView();
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z10, boolean z11) {
        int i10;
        ArrayList arrayList = this.f11115f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f11134b == i2) {
                int i12 = nVar.f11155x & (-5);
                if (z11) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                nVar.f11155x = i12 | i10;
                nVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f11131w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z10) {
        ArrayList arrayList = this.f11115f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f11134b == i2) {
                nVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z10) {
        int i10;
        ArrayList arrayList = this.f11115f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList.get(i11);
            if (nVar.f11134b == i2) {
                int i12 = nVar.f11155x;
                int i13 = i12 & (-9);
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                int i14 = i13 | i10;
                nVar.f11155x = i14;
                if (i12 != i14) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f11112c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f11115f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f11115f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i2, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f11123o = view;
            this.m = null;
            this.f11122n = null;
        } else {
            if (i2 > 0) {
                this.m = this.f11111b.getText(i2);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i10 > 0) {
                this.f11122n = this.f11110a.getDrawable(i10);
            } else if (drawable != null) {
                this.f11122n = drawable;
            }
            this.f11123o = null;
        }
        p(false);
    }

    public final void v() {
        this.f11124p = false;
        if (this.f11125q) {
            this.f11125q = false;
            p(this.f11126r);
        }
    }

    public final void w() {
        if (!this.f11124p) {
            this.f11124p = true;
            this.f11125q = false;
            this.f11126r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i10, int i11, CharSequence charSequence) {
        return a(i2, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i10, int i11, int i12) {
        return a(i2, i10, i11, this.f11111b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f11111b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i10, int i11, int i12) {
        return addSubMenu(i2, i10, i11, this.f11111b.getString(i12));
    }

    public l k() {
        return this;
    }
}
