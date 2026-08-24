package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {
    public final defpackage.ci6 A;
    public final java.util.ArrayList B;
    public boolean L;
    public int R;
    public boolean X;
    public int Y;

    public PreferenceGroup(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public PreferenceGroup(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r7 = 0
            r3.<init>(r4, r5, r6, r7)
            ci6 r0 = new ci6
            r0.<init>(r7)
            r3.A = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r0 = 1
            r3.L = r0
            r3.R = r7
            r3.X = r7
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.Y = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.B = r2
            int[] r2 = defpackage.i75.i
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            r5 = 2
            boolean r6 = r4.getBoolean(r5, r0)
            boolean r5 = r4.getBoolean(r5, r6)
            r3.L = r5
            boolean r5 = r4.hasValue(r0)
            if (r5 == 0) goto L63
            int r5 = r4.getInt(r0, r1)
            int r5 = r4.getInt(r0, r5)
            if (r5 == r1) goto L61
            boolean r6 = r3.hasKey()
            if (r6 != 0) goto L61
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = " should have a key defined if it contains an expandable preference"
            java.lang.String r6 = r6.concat(r7)
            java.lang.String r7 = "PreferenceGroup"
            android.util.Log.e(r7, r6)
        L61:
            r3.Y = r5
        L63:
            r4.recycle()
            return
    }

    @Override // androidx.preference.Preference
    public final void dispatchRestoreInstanceState(android.os.Bundle r4) {
            r3 = this;
            super.dispatchRestoreInstanceState(r4)
            java.util.ArrayList r0 = r3.B
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L16
            androidx.preference.Preference r2 = r3.g(r1)
            r2.dispatchRestoreInstanceState(r4)
            int r1 = r1 + 1
            goto La
        L16:
            return
    }

    @Override // androidx.preference.Preference
    public final void dispatchSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            super.dispatchSaveInstanceState(r4)
            java.util.ArrayList r0 = r3.B
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L16
            androidx.preference.Preference r2 = r3.g(r1)
            r2.dispatchSaveInstanceState(r4)
            int r1 = r1 + 1
            goto La
        L16:
            return
    }

    public final void e(androidx.preference.Preference r7) {
            r6 = this;
            java.util.ArrayList r0 = r6.B
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = r7.getKey()
            if (r0 == 0) goto L3d
            r0 = r6
        L10:
            androidx.preference.PreferenceGroup r1 = r0.getParent()
            if (r1 == 0) goto L1b
            androidx.preference.PreferenceGroup r0 = r0.getParent()
            goto L10
        L1b:
            java.lang.String r1 = r7.getKey()
            androidx.preference.Preference r0 = r0.f(r1)
            if (r0 == 0) goto L3d
            java.lang.String r0 = "PreferenceGroup"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Found duplicated key: \""
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.e(r0, r1)
        L3d:
            int r0 = r7.getOrder()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L5e
            boolean r0 = r6.L
            if (r0 == 0) goto L53
            int r0 = r6.R
            int r1 = r0 + 1
            r6.R = r1
            r7.setOrder(r0)
        L53:
            boolean r0 = r7 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L5e
            r0 = r7
            androidx.preference.PreferenceGroup r0 = (androidx.preference.PreferenceGroup) r0
            boolean r1 = r6.L
            r0.L = r1
        L5e:
            java.util.ArrayList r0 = r6.B
            int r0 = java.util.Collections.binarySearch(r0, r7)
            if (r0 >= 0) goto L6a
            int r0 = r0 * (-1)
            int r0 = r0 + (-1)
        L6a:
            boolean r1 = r6.shouldDisableDependents()
            r7.onParentChanged(r6, r1)
            monitor-enter(r6)
            java.util.ArrayList r1 = r6.B     // Catch: java.lang.Throwable -> Lb9
            r1.add(r0, r7)     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb9
            v15 r0 = r6.getPreferenceManager()
            java.lang.String r1 = r7.getKey()
            if (r1 == 0) goto L9c
            ci6 r2 = r6.A
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L9c
            ci6 r2 = r6.A
            java.lang.Object r2 = r2.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            ci6 r4 = r6.A
            r4.remove(r1)
            goto La5
        L9c:
            monitor-enter(r0)
            long r2 = r0.b     // Catch: java.lang.Throwable -> Lb6
            r4 = 1
            long r4 = r4 + r2
            r0.b = r4     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
        La5:
            r7.onAttachedToHierarchy(r0, r2)
            r7.assignParent(r6)
            boolean r0 = r6.X
            if (r0 == 0) goto Lb2
            r7.onAttached()
        Lb2:
            r6.notifyHierarchyChanged()
            return
        Lb6:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            throw r6
        Lb9:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb9
            throw r7
    }

    public final androidx.preference.Preference f(java.lang.CharSequence r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L37
            java.lang.String r1 = r5.getKey()
            boolean r1 = android.text.TextUtils.equals(r1, r6)
            if (r1 == 0) goto Le
            return r5
        Le:
            java.util.ArrayList r1 = r5.B
            int r1 = r1.size()
            r2 = 0
        L15:
            if (r2 >= r1) goto L36
            androidx.preference.Preference r3 = r5.g(r2)
            java.lang.String r4 = r3.getKey()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 == 0) goto L26
            return r3
        L26:
            boolean r4 = r3 instanceof androidx.preference.PreferenceGroup
            if (r4 == 0) goto L33
            androidx.preference.PreferenceGroup r3 = (androidx.preference.PreferenceGroup) r3
            androidx.preference.Preference r3 = r3.f(r6)
            if (r3 == 0) goto L33
            return r3
        L33:
            int r2 = r2 + 1
            goto L15
        L36:
            return r0
        L37:
            java.lang.String r5 = "Key cannot be null"
            defpackage.i.h(r5)
            return r0
    }

    public final androidx.preference.Preference g(int r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.B
            java.lang.Object r0 = r0.get(r1)
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            return r0
    }

    @Override // androidx.preference.Preference
    public final void notifyDependencyChange(boolean r4) {
            r3 = this;
            super.notifyDependencyChange(r4)
            java.util.ArrayList r0 = r3.B
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L16
            androidx.preference.Preference r2 = r3.g(r1)
            r2.onParentChanged(r3, r4)
            int r1 = r1 + 1
            goto La
        L16:
            return
    }

    @Override // androidx.preference.Preference
    public final void onAttached() {
            r3 = this;
            r3.a()
            r0 = 1
            r3.X = r0
            java.util.ArrayList r0 = r3.B
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L19
            androidx.preference.Preference r2 = r3.g(r1)
            r2.onAttached()
            int r1 = r1 + 1
            goto Ld
        L19:
            return
    }

    @Override // androidx.preference.Preference
    public final void onDetached() {
            r3 = this;
            super.onDetached()
            r0 = 0
            r3.X = r0
            java.util.ArrayList r1 = r3.B
            int r1 = r1.size()
        Lc:
            if (r0 >= r1) goto L18
            androidx.preference.Preference r2 = r3.g(r0)
            r2.onDetached()
            int r0 = r0 + 1
            goto Lc
        L18:
            return
    }

    @Override // androidx.preference.Preference
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<r15> r1 = defpackage.r15.class
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10
            super.onRestoreInstanceState(r3)
            return
        L10:
            r15 r3 = (defpackage.r15) r3
            int r0 = r3.A
            r2.Y = r0
            android.os.Parcelable r3 = r3.getSuperState()
            super.onRestoreInstanceState(r3)
            return
    }

    @Override // androidx.preference.Preference
    public final android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            super.onSaveInstanceState()
            android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
            r15 r0 = new r15
            int r1 = r1.Y
            r0.<init>(r1)
            return r0
    }
}
