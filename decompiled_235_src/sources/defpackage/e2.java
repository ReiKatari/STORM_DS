package defpackage;

import java.text.BreakIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e2  reason: default package */
/* loaded from: classes.dex */
public final class e2 extends d2 {
    public static e2 e;
    public static e2 f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i) {
        super(0);
        this.c = i;
    }

    @Override // defpackage.d2
    public final int[] f(int i) {
        switch (this.c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i);
                        BreakIterator breakIterator2 = this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i = breakIterator2.following(i);
                            } else {
                                nb3.a0("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int following = breakIterator2.following(i);
                            if (following == -1) {
                                return null;
                            }
                            return i(i, following);
                        } else {
                            nb3.a0("impl");
                            throw null;
                        }
                    } else {
                        nb3.a0("impl");
                        throw null;
                    }
                } while (i != -1);
                return null;
            default:
                if (j().length() <= 0 || i >= j().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!u(i) && (!u(i) || (i != 0 && u(i - 1)))) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 != null) {
                        i = breakIterator3.following(i);
                        if (i == -1) {
                            return null;
                        }
                    } else {
                        nb3.a0("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 != null) {
                    int following2 = breakIterator4.following(i);
                    if (following2 == -1 || !t(following2)) {
                        return null;
                    }
                    return i(i, following2);
                }
                nb3.a0("impl");
                throw null;
        }
    }

    @Override // defpackage.d2
    public final int[] q(int i) {
        switch (this.c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i);
                        BreakIterator breakIterator2 = this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i = breakIterator2.preceding(i);
                            } else {
                                nb3.a0("impl");
                                throw null;
                            }
                        } else if (breakIterator2 != null) {
                            int preceding = breakIterator2.preceding(i);
                            if (preceding == -1) {
                                return null;
                            }
                            return i(preceding, i);
                        } else {
                            nb3.a0("impl");
                            throw null;
                        }
                    } else {
                        nb3.a0("impl");
                        throw null;
                    }
                } while (i != -1);
                return null;
            default:
                int length2 = j().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !u(i - 1) && !t(i)) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 != null) {
                        i = breakIterator3.preceding(i);
                        if (i == -1) {
                            return null;
                        }
                    } else {
                        nb3.a0("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 != null) {
                    int preceding2 = breakIterator4.preceding(i);
                    if (preceding2 == -1 || !u(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && u(preceding2 - 1)) {
                        return null;
                    }
                    return i(preceding2, i);
                }
                nb3.a0("impl");
                throw null;
        }
    }

    public final void s(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    nb3.a0("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    nb3.a0("impl");
                    throw null;
                }
        }
    }

    public boolean t(int i) {
        if (i > 0 && u(i - 1)) {
            if (i == j().length() || !u(i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean u(int i) {
        if (i >= 0 && i < j().length()) {
            return Character.isLetterOrDigit(j().codePointAt(i));
        }
        return false;
    }
}
