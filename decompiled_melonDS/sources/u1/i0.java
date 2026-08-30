package u1;

import android.view.KeyEvent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13330a;

    public /* synthetic */ i0(int i2) {
        this.f13330a = i2;
    }

    public final h0 a(KeyEvent keyEvent) {
        h0 h0Var;
        h0 h0Var2 = null;
        switch (this.f13330a) {
            case 0:
                int i2 = j0.f13346b0;
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    if (!t3.a.a(t3.c.a(keyEvent.getKeyCode()), t3.a.f13097q)) {
                        return null;
                    }
                    return h0.REDO;
                } else if (keyEvent.isCtrlPressed()) {
                    long b10 = t3.c.b(keyEvent);
                    if (!t3.a.a(b10, t3.a.f13093l) && !t3.a.a(b10, t3.a.f13106z)) {
                        if (t3.a.a(b10, t3.a.f13094n)) {
                            return h0.PASTE;
                        }
                        if (t3.a.a(b10, t3.a.f13095o)) {
                            return h0.CUT;
                        }
                        if (t3.a.a(b10, t3.a.f13092k)) {
                            return h0.SELECT_ALL;
                        }
                        if (t3.a.a(b10, t3.a.f13096p)) {
                            return h0.REDO;
                        }
                        if (!t3.a.a(b10, t3.a.f13097q)) {
                            return null;
                        }
                        return h0.UNDO;
                    }
                    return h0.COPY;
                } else if (keyEvent.isCtrlPressed()) {
                    return null;
                } else {
                    if (keyEvent.isShiftPressed()) {
                        long a10 = t3.c.a(keyEvent.getKeyCode());
                        if (t3.a.a(a10, t3.a.f13087f)) {
                            return h0.SELECT_LEFT_CHAR;
                        }
                        if (t3.a.a(a10, t3.a.f13088g)) {
                            return h0.SELECT_RIGHT_CHAR;
                        }
                        if (t3.a.a(a10, t3.a.f13085d)) {
                            return h0.SELECT_UP;
                        }
                        if (t3.a.a(a10, t3.a.f13086e)) {
                            return h0.SELECT_DOWN;
                        }
                        if (t3.a.a(a10, t3.a.F)) {
                            return h0.SELECT_PAGE_UP;
                        }
                        if (t3.a.a(a10, t3.a.G)) {
                            return h0.SELECT_PAGE_DOWN;
                        }
                        if (t3.a.a(a10, t3.a.f13104x)) {
                            return h0.SELECT_LINE_START;
                        }
                        if (t3.a.a(a10, t3.a.f13105y)) {
                            return h0.SELECT_LINE_END;
                        }
                        if (!t3.a.a(a10, t3.a.f13106z)) {
                            return null;
                        }
                        return h0.PASTE;
                    }
                    long a11 = t3.c.a(keyEvent.getKeyCode());
                    if (t3.a.a(a11, t3.a.f13087f)) {
                        return h0.LEFT_CHAR;
                    }
                    if (t3.a.a(a11, t3.a.f13088g)) {
                        return h0.RIGHT_CHAR;
                    }
                    if (t3.a.a(a11, t3.a.f13085d)) {
                        return h0.UP;
                    }
                    if (t3.a.a(a11, t3.a.f13086e)) {
                        return h0.DOWN;
                    }
                    if (t3.a.a(a11, t3.a.f13089h)) {
                        return h0.CENTER;
                    }
                    if (t3.a.a(a11, t3.a.F)) {
                        return h0.PAGE_UP;
                    }
                    if (t3.a.a(a11, t3.a.G)) {
                        return h0.PAGE_DOWN;
                    }
                    if (t3.a.a(a11, t3.a.f13104x)) {
                        return h0.LINE_START;
                    }
                    if (t3.a.a(a11, t3.a.f13105y)) {
                        return h0.LINE_END;
                    }
                    if (!t3.a.a(a11, t3.a.f13100t) && !t3.a.a(a11, t3.a.M)) {
                        if (t3.a.a(a11, t3.a.f13101u)) {
                            return h0.DELETE_PREV_CHAR;
                        }
                        if (t3.a.a(a11, t3.a.f13102v)) {
                            return h0.DELETE_NEXT_CHAR;
                        }
                        if (t3.a.a(a11, t3.a.C)) {
                            return h0.PASTE;
                        }
                        if (t3.a.a(a11, t3.a.A)) {
                            return h0.CUT;
                        }
                        if (t3.a.a(a11, t3.a.B)) {
                            return h0.COPY;
                        }
                        if (!t3.a.a(a11, t3.a.f13098r)) {
                            return null;
                        }
                        return h0.TAB;
                    }
                    return h0.NEW_LINE;
                }
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long a12 = t3.c.a(keyEvent.getKeyCode());
                    if (t3.a.a(a12, t3.a.f13087f)) {
                        h0Var = h0.SELECT_LINE_LEFT;
                    } else if (t3.a.a(a12, t3.a.f13088g)) {
                        h0Var = h0.SELECT_LINE_RIGHT;
                    } else if (t3.a.a(a12, t3.a.f13085d)) {
                        h0Var = h0.SELECT_HOME;
                    } else {
                        if (t3.a.a(a12, t3.a.f13086e)) {
                            h0Var = h0.SELECT_END;
                        }
                        h0Var = null;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long a13 = t3.c.a(keyEvent.getKeyCode());
                        if (t3.a.a(a13, t3.a.f13087f)) {
                            h0Var = h0.LINE_LEFT;
                        } else if (t3.a.a(a13, t3.a.f13088g)) {
                            h0Var = h0.LINE_RIGHT;
                        } else if (t3.a.a(a13, t3.a.f13085d)) {
                            h0Var = h0.HOME;
                        } else if (t3.a.a(a13, t3.a.f13086e)) {
                            h0Var = h0.END;
                        }
                    }
                    h0Var = null;
                }
                if (h0Var == null) {
                    rd.k kVar = k0.f13357a;
                    kVar.getClass();
                    if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                        long a14 = t3.c.a(keyEvent.getKeyCode());
                        if (t3.a.a(a14, t3.a.f13087f)) {
                            h0Var2 = h0.SELECT_LEFT_WORD;
                        } else if (t3.a.a(a14, t3.a.f13088g)) {
                            h0Var2 = h0.SELECT_RIGHT_WORD;
                        } else if (t3.a.a(a14, t3.a.f13085d)) {
                            h0Var2 = h0.SELECT_PREV_PARAGRAPH;
                        } else if (t3.a.a(a14, t3.a.f13086e)) {
                            h0Var2 = h0.SELECT_NEXT_PARAGRAPH;
                        }
                    } else if (keyEvent.isCtrlPressed()) {
                        long a15 = t3.c.a(keyEvent.getKeyCode());
                        if (t3.a.a(a15, t3.a.f13087f)) {
                            h0Var2 = h0.LEFT_WORD;
                        } else if (t3.a.a(a15, t3.a.f13088g)) {
                            h0Var2 = h0.RIGHT_WORD;
                        } else if (t3.a.a(a15, t3.a.f13085d)) {
                            h0Var2 = h0.PREV_PARAGRAPH;
                        } else if (t3.a.a(a15, t3.a.f13086e)) {
                            h0Var2 = h0.NEXT_PARAGRAPH;
                        } else if (t3.a.a(a15, t3.a.m)) {
                            h0Var2 = h0.DELETE_PREV_CHAR;
                        } else if (t3.a.a(a15, t3.a.f13102v)) {
                            h0Var2 = h0.DELETE_NEXT_WORD;
                        } else if (t3.a.a(a15, t3.a.f13101u)) {
                            h0Var2 = h0.DELETE_PREV_WORD;
                        } else if (t3.a.a(a15, t3.a.D)) {
                            h0Var2 = h0.DESELECT;
                        }
                    } else if (keyEvent.isShiftPressed()) {
                        long a16 = t3.c.a(keyEvent.getKeyCode());
                        if (t3.a.a(a16, t3.a.f13104x)) {
                            h0Var2 = h0.SELECT_LINE_START;
                        } else if (t3.a.a(a16, t3.a.f13105y)) {
                            h0Var2 = h0.SELECT_LINE_END;
                        }
                    } else if (keyEvent.isAltPressed()) {
                        long a17 = t3.c.a(keyEvent.getKeyCode());
                        if (t3.a.a(a17, t3.a.f13101u)) {
                            h0Var2 = h0.DELETE_FROM_LINE_START;
                        } else if (t3.a.a(a17, t3.a.f13102v)) {
                            h0Var2 = h0.DELETE_TO_LINE_END;
                        }
                    }
                    if (h0Var2 == null) {
                        return ((i0) kVar.B).a(keyEvent);
                    }
                    return h0Var2;
                }
                return h0Var;
        }
    }
}
