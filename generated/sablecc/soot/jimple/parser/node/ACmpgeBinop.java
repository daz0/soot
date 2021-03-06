/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ACmpgeBinop extends PBinop
{
    private TCmpge _cmpge_;

    public ACmpgeBinop()
    {
        // Constructor
    }

    public ACmpgeBinop(
        @SuppressWarnings("hiding") TCmpge _cmpge_)
    {
        // Constructor
        setCmpge(_cmpge_);

    }

    @Override
    public Object clone()
    {
        return new ACmpgeBinop(
            cloneNode(this._cmpge_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmpgeBinop(this);
    }

    public TCmpge getCmpge()
    {
        return this._cmpge_;
    }

    public void setCmpge(TCmpge node)
    {
        if(this._cmpge_ != null)
        {
            this._cmpge_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmpge_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cmpge_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cmpge_ == child)
        {
            this._cmpge_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cmpge_ == oldChild)
        {
            setCmpge((TCmpge) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
