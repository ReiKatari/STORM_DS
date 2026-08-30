package b4;

import java.text.BreakIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: e  reason: collision with root package name */
    public static c f1793e;

    /* renamed from: f  reason: collision with root package name */
    public static c f1794f;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1795c;

    /* renamed from: d  reason: collision with root package name */
    public BreakIterator f1796d;

    @Override // b4.b
    public final int[] e(int i2) {
        switch (this.f1795c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f1796d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = this.f1796d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.following(i2);
                            } else {
                                nc.k.f("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int following = breakIterator2.following(i2);
                            if (following == -1) {
                                return null;
                            }
                            return h(i2, following);
                        } else {
                            nc.k.f("impl");
                            throw null;
                        }
                    } else {
                        nc.k.f("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            default:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!t(i2) && (!t(i2) || (i2 != 0 && t(i2 - 1)))) {
                    BreakIterator breakIterator3 = this.f1796d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.following(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        nc.k.f("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = this.f1796d;
                if (breakIterator4 != null) {
                    int following2 = breakIterator4.following(i2);
                    if (following2 == -1 || !s(following2)) {
                        return null;
                    }
                    return h(i2, following2);
                }
                nc.k.f("impl");
                throw null;
        }
    }

    @Override // b4.b
    public final int[] p(int i2) {
        switch (this.f1795c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = this.f1796d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = this.f1796d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.preceding(i2);
                            } else {
                                nc.k.f("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int preceding = breakIterator2.preceding(i2);
                            if (preceding == -1) {
                                return null;
                            }
                            return h(preceding, i2);
                        } else {
                            nc.k.f("impl");
                            throw null;
                        }
                    } else {
                        nc.k.f("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            default:
                int length2 = i().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !t(i2 - 1) && !s(i2)) {
                    BreakIterator breakIterator3 = this.f1796d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.preceding(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        nc.k.f("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = this.f1796d;
                if (breakIterator4 != null) {
                    int preceding2 = breakIterator4.preceding(i2);
                    if (preceding2 == -1 || !t(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && t(preceding2 - 1)) {
                        return null;
                    }
                    return h(preceding2, i2);
                }
                nc.k.f("impl");
                throw null;
        }
    }

    public final void r(String str) {
        switch (this.f1795c) {
            case 0:
                this.f1790a = str;
                BreakIterator breakIterator = this.f1796d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    nc.k.f("impl");
                    throw null;
                }
            default:
                this.f1790a = str;
                BreakIterator breakIterator2 = this.f1796d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    nc.k.f("impl");
                    throw null;
                }
        }
    }

    public boolean s(int i2) {
        if (i2 > 0 && t(i2 - 1)) {
            if (i2 == i().length() || !t(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean t(int i2) {
        if (i2 >= 0 && i2 < i().length()) {
            return Character.isLetterOrDigit(i().codePointAt(i2));
        }
        return false;
    }
}
