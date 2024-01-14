package Model;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Panier implements List<Article> {
	
	List<Article> articles;
	

    public Panier() {
        this.articles = new ArrayList<>();
    }

    public void ajouterArticle(Article article) {
        articles.add(article);
    }

    public void retirerArticle(Article article) {
        articles.remove(article);
    }

    public List<Article> getArticles() {
        return articles;
    }
    
   

    public double calculerTotal() {
        double total = 0;
        for (Article article : articles) {
            total += article.getPrix();
        }
        return total;
    }

	public boolean add(Article articleChoisi) {
		return articles.add(articleChoisi);
	
	}

	public int size() {
		// TODO Auto-generated method stub
		return articles.size();
		
	}

	public Article remove(int i) {
		// TODO Auto-generated method stub
		 Article m=articles.get(i);
		  articles.remove(m);
		  return m ;
	
	}

	public void clear() {
		// TODO Auto-generated method stub
		articles.clear();
	}

	

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Article get(int i) {
		// TODO Auto-generated method stub
		Article m = articles.get(i);
		return m;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Article> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Article> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Article> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Article set(int index, Article element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Article element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Article> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Article> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
